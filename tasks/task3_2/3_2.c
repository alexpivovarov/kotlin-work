#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]) {
    if (argc != 2) {
        printf("ERROR");
        return 1;
    }

    int number = atoi(argv[1]);
    printf("%d\n", number * number);

}