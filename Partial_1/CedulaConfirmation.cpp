#include <stdio.h>
#include <conio.h>

int main(){
    int num=0,res=0,cont=0,i=0,suma=0,dig=0;
    printf("\n\tIntroduce el numero de cedula: \n\n\t");
    scanf("%d", &num);
    int vector[10];
    for(i=0; i<=9; i++){
        vector[i]=num%10;
        num=num/10;
        cont++;
    }
    /*printf("Vector: ");
    for(i=cont-1 ;i>=0 ; i--){
        printf("%d", vector[i]);
    }*/
    if (((vector[9]*2)>9)||((vector[7]*2)>9)||((vector[5]*2)>9)||((vector[3]*2)>9)||((vector[1]*2)>9)){
        if ((vector[9]*2)>9){
        vector[9]=(vector[9]*2)-9;
    }
    else{
        vector[9]=vector[9]*2;
    }
    if ((vector[7]*2)>9){
        vector[7]=(vector[7]*2)-9;
    }
    else{
        vector[7]=vector[7]*2;
    }
    if ((vector[5]*2)>9){
        vector[5]=(vector[5]*2)-9;
    }
    else{
        vector[5]=vector[5]*2;
    }
    if ((vector[3]*2)>9){
        vector[3]=(vector[3]*2)-9;
    }
    else{
        vector[3]=vector[3]*2;
    }
    if ((vector[1]*2)>9){
        vector[1]=(vector[1]*2)-9;
    }
    else{
        vector[1]=vector[1]*2;
    }
    suma=(vector[9])+(vector[7])+(vector[5])+(vector[3])+(vector[1])+vector[8]+vector[6]+vector[4]+vector[2];
        //printf ("\n%i",suma);
        res= suma%10;
        if(res!=0){
            dig=10-res;
            //printf ("\ndig: %i",dig);
            if (vector[0]==dig){
                printf ("\n\n\tEl numero de cedula es correcto...");
            }
            else{
                printf ("\n\n\tEl numero de cedula es incorrecto...");
            }
        }
        else{
        dig=res;
        printf ("\ndig: %i",dig);suma=(vector[9]*2)+(vector[7]*2)+(vector[5]*2)+(vector[3]*2)+(vector[1]*2)+vector[8]+vector[6]+vector[4]+vector[2];
        //printf ("\n%i",suma);
        res= suma%10;
        if(res!=0){
            dig=10-res;
            //printf ("\ndig: %i",dig);
            if (vector[0]==dig){
                printf ("\n\n\tEl numero de cedula es correcto...");
            }
            else{
                printf ("\n\n\tEl numero de cedula es incorrecto...");
            }
        }
        else{
        dig=res;
        //printf ("\ndig: %i",dig);
        if (vector[0]==dig){
                printf ("\n\n\tEl numero de cedula es correcto...");
            }
            else{
                printf ("\n\n\tEl numero de cedula es incorrecto...");
            }
        }
        }
    }
    else{
        suma=(vector[9]*2)+(vector[7]*2)+(vector[5]*2)+(vector[3]*2)+(vector[1]*2)+vector[8]+vector[6]+vector[4]+vector[2];
        //printf ("\n%i",suma);
        res= suma%10;
        if(res!=0){
            dig=10-res;
            //printf ("\ndig: %i",dig);
            if (vector[0]==dig){
                printf ("\n\n\tEl numero de cedula es correcto...");
            }
            else{
                printf ("\n\n\tEl numero de cedula es incorrecto...");
            }
        }
        else{
        dig=res;
        //printf ("\ndig: %i",dig);
        if (vector[0]==dig){
                printf ("\n\n\tEl numero de cedula es correcto...");
            }
            else{
                printf ("\n\n\tEl numero de cedula es incorrecto...");
            }
        }
    }
getch();
return 0;
}
