#include <stdio.h>
#include <unistd.h>
#include <string.h>
int main(int argc, char * argv[])
{
if (argc <3 || argc >4)
{
printf("Error in usage\n");
return -1;
}
if(argc==4 && strcmp (argv[1], "-s") !=0)
{
printf(" for symbolic link use -s option");
return -1;
}
if (argc == 4 && access (argv[2], F_OK) == -1)
{
printf("Source file does not exist");
return -1;
}
if(argc ==3 && access (argv[1], F_OK) == -1)
{
printf ("Source file does not exist");
return -1;
}
if(argc == 4)
{
symlink(argv[2], argv[3]);
printf("Symbolic link is created");
return 0;
}
if( argc == 3)
{
link(argv[1], argv[2]);
printf("Hardlink is created");
return 0;
}
return 0;
}
