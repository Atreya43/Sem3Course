#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/stat.h>
#include<sys/types.h>
int main()
{
    int fd1,fd2;
    char c;
    int offset;
    fd1=open("f1.txt",O_RDONLY);
    if(fd1<0)
    {
        printf("%s","Open Error");
    }
    fd2=open("f2.txt",O_WRONLY|O_CREAT,0670);
    if(fd2<0)
    {
        printf("%s","Open Error");
    }
    offset=lseek(fd1,-1,SEEK_END);
//    offset=offset+1;
    while (offset>=0)
    {
        read(fd1,&c,1);
        write(fd2,&c,1);
        lseek(fd1,-2,SEEK_CUR);
        offset--;
    }
    read(fd1,&c,1);
    write(fd2,&c,1);
    close(fd1);
    close(fd2);
    return 0;
}
