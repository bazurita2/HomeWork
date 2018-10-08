#include<stdio.h>
#include<stdlib.h>
#include<fstream>
#include<iostream>
#include<string.h>
#include<cstring>
#include <conio.h>
#include <windows.h>
using namespace std;


bool confirmar(string usuario, string contrasena);
int archivo(string usuario);
int MenuAdmi ();
int menu();
int menu_usuario();
void crear(int n);
void mostrar(int n);
void crear_eq();
void agregar_jug();
void mostrarjug();
void mostrar_eq();
void modificar_eq(string equipo2);

struct Equipo
{
    char nombre[20];
};

struct Usuario
{
    char user[10];
    char contrasena[10];
}usuario;

struct Jugador
{
    char nombre[20];
    char equipo[20];
    char categoria[20];
}jugadores;

int main()
{
    system ("color 8F");
    string nomb_archivo;
    int aux,op,op1,op2;
    bool conf;
    int cont=0;
    do
    {
        system ("color 8F");
        cout<<endl<<endl<<endl<<endl<<endl;
         cout<<"\t******************(( INGRESE EL USUARIO)) ******************"<<endl;
         cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
        cin.getline(usuario.user,10);
        fflush(stdin);
        cout<<endl;

        cout<<"\t**************(( INGRESE LA CONTRASENA ))**************"<<endl;
         cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
        cin.getline(usuario.contrasena,10);
        fflush(stdin);
        system("cls");
        conf=confirmar(usuario.user,usuario.contrasena);
        string aux1, aux2;
        aux1=usuario.user;
        aux2=usuario.contrasena;
        if(aux1=="admin" && aux2=="123")
        {
            cont=4;
            aux=2;
        }
        else
        {
            if(conf)
            {
            cont=4;
            aux=archivo(usuario.user);
            }
            else
            {   cout<<endl<<endl<<endl<<endl<<endl<<endl<<endl<<endl<<endl;

                cout<<"\t***********(( EL USUARIO O CONTRASEÑA SON INCORRECTOS )) **********"<<endl<<endl<<endl;
                cout<<"\t*******************((  INTENTE NUEVAMENTE )) **********************"<<endl;
                cont++;
                getch();
                system("cls");
                if(cont==3)
                {
                    exit(1);
                }

            }
            }
        }while(cont<3);

    if(aux==1)//usuarios
    {
       system ("color f2");
       nomb_archivo="usuario.dat";
       menu2:
        cout<<endl<<endl;
       cout<<"\t***************(( Bienvenido Usuario ))******************"<<endl<<endl;
       cout<<"\t1.- AGREGAR JUGADORES A UN EQUIPO\n\n \t2.- MOSTRAR TODOS LOS JUGADORES\n\n\t3.- SALIR\n\n\n\tESCOJA UNA OPCION:";
       cin>>op2;
       fflush(stdin);
       switch(op2)
       {
       case 1:
              system ("color 79");
           mostrar_eq();
            fflush(stdin);
            agregar_jug();
            goto menu2;
       case 2:
           system ("color 02");
            mostrarjug();
            goto menu2;
       case 3:
        break;
       }
       }

    if(aux==2)//admi
    {
        system ("color 02");
        nomb_archivo="admnistradores.dat";
        menu:
        op=MenuAdmi();
        if(op==1)//equipo
        {
            op1=menu();
            switch(op1)
            {
            case 1:

                crear_eq();
                mostrar_eq();
                system("cls");
                goto menu;

            case 2:
                mostrar_eq();
                cout<<"Ingrese el nombre del Equipo a modificar:"<<endl;
                cin.getline(jugadores.equipo,20);
                fflush(stdin);
                modificar_eq(jugadores.equipo);
                mostrar_eq();
                goto menu;
            case 3:
                mostrar_eq();
                goto menu;
            case 4:
                exit(1);

            }
        }
        if(op==2)    //usuarios


        {
            int opcion=0;
            opcion=menu_usuario();
            switch (opcion){
            case 1:
                system ("color 0f");
                crear(opcion);
                getch();
                goto menu;
            case 2:
                system ("color 84");
                crear(opcion);
                getch();
                goto menu;
           case 3:
               system ("color 79");
               mostrar(opcion);
                getch();
                goto menu;
            case 4:
                system ("color 0fs");
                mostrar(opcion);
                getch();
                goto menu;
            case 5:
                cout<<endl;
                cout<<"\t*******QUE TENGA UN BUEN DIA**************";
                break;
        }
    }
        if(op==3)
        {
            exit(1);

        }
    }


    getch();
    return 0;
}



bool confirmar(string usuario, string contrasena)
{
    system ("color f4");
    Usuario users;
    string aux, aux2;
    ifstream archivo("usuario.dat");
    archivo.read((char*)&users,sizeof(users));

    while(archivo && !archivo.eof()){
        aux=users.user;
        aux2=users.contrasena;
        if(usuario==aux &&contrasena==aux2){
            cout<<endl<<endl<<endl<<endl<<endl<<endl<<endl;
            cout<<"\t**********(( EL USUARIO "<<users.user<<" FUE ENCONTRADO ))*********"<<endl;
            cout<<endl<<endl;
            cout<<"\t****************(( CONTRASENA CORRECTA ))*************"<<endl;
            cout<<endl;
            getch();
            system("cls");
            return true;
        }
        archivo.read((char*)&users,sizeof(users));
    }
    archivo.close();

    ifstream archivo2("administradores.dat");
    archivo2.read((char*)&users,sizeof(users));

    while(archivo2 && !archivo2.eof()){

        aux=users.user;
        aux2=users.contrasena;
        if(usuario==aux && contrasena==aux2 ){
            cout<<endl<<endl<<endl<<endl<<endl<<endl<<endl;
            cout<<"\t**********(( EL USUARIO "<<users.user<<" FUE ENCONTRADO ))*********"<<endl;
             cout<<endl<<endl;
            cout<<"\t****************(( CONTRASENA CORRECTA ))*************"<<endl;
            cout<<endl;
            getch();
            system("cls");
            return true;
        }
        archivo2.read((char*)&users,sizeof(users));
    }
    archivo2.close();

    return false;
}

int archivo(string usuario)
{
    Usuario users;
    string aux;
    ifstream archivo("usuario.dat");
    archivo.read((char*)&users,sizeof(users));

    while(archivo && !archivo.eof()){
        aux=users.user;
        if(usuario==aux){
            system("cls");
            return 1;
        }
        else
        {
        return 2;}
        archivo.read((char*)&users,sizeof(users));
    }
    archivo.close();
}

int MenuAdmi ()
{
system ("color 02");
    system ("cls");
    int op;
    cout<<endl<<endl;
    cout<<"\t******************(( BIENVENIDO ADMINISTRADOR ))******************"<<endl<<endl;
    cout<<"\t1.- EQUIPO"<<endl;
    cout<<"\t2.- USUARIOS"<<endl;
    cout<<"\t3.- SALIR"<<endl<<endl<<endl;
    cout<<"\tESCOJA UNA OPCION: ";
    cin>>op;
    return op;
}

int menu()
{
    system ("color 8f");
system("cls");
    int op;
    cout<<endl<<endl;
    cout<<"\t*****************(( BIENVENIDO AL MENU DE EQUIPOS ))****************"<<endl<<endl;
    cout<<"\t1.- AGREGAR"<<endl;
    cout<<"\t2.- MODIFICAR"<<endl;
    cout<<"\t3.- MOSTRAR"<<endl;
    cout<<"\t4.- SALIR"<<endl<<endl<<endl;
    cout<<"\tESCOJA UNA OPCION: ";
    cin>>op;
    fflush(stdin);
    return op;
}

int menu_usuario()
{
    system ("cls");
    int opcion;
    cout<<endl<<endl;
    cout<<"\n\t*********************(( MENU DE USUARIOS ))**********************"<<endl<<endl;
    cout<<"\t1.- AGREGAR USUARIO"<<endl;
    cout<<"\t2.- AGREGAR ADMINISTRADOR"<<endl;
    cout<<"\t3.- MOSTRAR USUARIOS"<<endl;
    cout<<"\t4.- MOSTRAR ADMINISTRADORES"<<endl;
    cout<<"\t5.- SALIR"<<endl<<endl<<endl;
    cout<<"\tDigite una opcion: ";
    cin>>opcion;
    fflush(stdin);
    return opcion;
}


void crear(int n)
{

    system ("cls");
    string nombre_archivo;
    if(n==1)
    {
    nombre_archivo="usuario.dat";
    }
    if(n==2)
    {
    nombre_archivo="administradores.dat";
    }
    ofstream archivo;
    Usuario usuario;
    archivo.open(nombre_archivo.c_str(), ios::app | ios::binary);
    if(archivo.fail())
    {
        cout<<"No se pudo abrir el archivo"<<endl;
        exit(1);
    }
    cout<<endl<<endl<<endl;
    cout<<"\t************(( INGRESE EL NOMBRE DEL USUARIO ))*************"<<endl<<endl<<endl;
    cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
    cin.getline(usuario.user,10);
    fflush(stdin);
    cout<<endl<<endl;
    cout<<"\t***************(( INGRESE LA CONTRASENA ))******************"<<endl;
    cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
    cin.getline(usuario.contrasena,10);
    fflush(stdin);
    archivo.write((char *)&usuario,sizeof(usuario));
    archivo.close();
    system ("cls");
    cout<<"\n\n\n\n\n\n\n\n\t *****************(( CREADO CORRECTAMENTE ))*************************";
}

void mostrar(int n)
{
    system ("cls");
    string nombre_archivo;
    struct Usuario usuario;
    if(n==3)
    {

    cout<<endl<<endl<<endl;
    cout<<"\t********************(( LISTA DE USUARIOS)) ***********************"<<endl<<endl;
    cout<<"USUARIOS        CONTRASENAS"<<endl<<endl;

    nombre_archivo="usuario.dat";
    }
    if(n==4)
    {
    cout<<endl<<endl<<endl;
    cout<<"\t********************(( LISTA DE ADMINISTRADORES)) *****************"<<endl<<endl;
    cout<<"ADMIN       CONTRASENAS"<<endl<<endl;
    nombre_archivo="administradores.dat";
    }

    ifstream archivo(nombre_archivo.c_str(),ios::in | ios::binary);
    if(archivo.fail())
    {
        cout<<"No se pudo abrir el archivo"<<endl;
        exit(1);
    }

    archivo.read((char*)&usuario,sizeof(usuario));
    while(!archivo.eof())
    {
        cout<<usuario.user<<"\t\t"<<usuario.contrasena<<endl;
        archivo.read((char*)&usuario,sizeof(usuario));
    }
    archivo.close();
}


int buscar(string equipo1){
    system ("cls");
    struct Equipo equipo;
    int cont=0;
    string AUX;
    ifstream archivo;
    archivo.open("Equipo.txt", ios::app);
    archivo.read((char*)&equipo,sizeof(equipo));

    while(archivo && !archivo.eof()){
        cont++;
        AUX=equipo.nombre;
        if(equipo1==AUX){
            cout<<"Equipo encontrado "<<equipo.nombre<<endl;
            getch();
            return cont;
        }
        archivo.read((char*)&equipo,sizeof(equipo));
    }
    archivo.close();
    return -1;
}

void crear_eq()
{
    system("cls");
    ofstream archivo;
    Equipo equipo;
    archivo.open("Equipo.txt", ios::app |ios::out );
    if(archivo.fail())
    {
        cout<<"No se pudo abrir el archivo"<<endl;
        exit(1);
    }
    cout<<endl<<endl<<endl;
    cout<<"\t*************(( INGRESE EL NOMBRE DEL EQUIPO))********************"<<endl;
    cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
    cin.getline(equipo.nombre,20);
    fflush(stdin);
    if(buscar(equipo.nombre)!=-1)
    {
        cout<<"\nEl nombre de "<<equipo.nombre<<" no esta disponible"<<endl;
        cout<<"\t*************(( INGRESE OTRO NOMBRE DEL EQUIPO))********************"<<endl;
        cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
        cin.getline(equipo.nombre,20);
        fflush(stdin);

    }
    archivo.write((char*)&equipo,sizeof(equipo));
    archivo.close();
}


void agregar_jug()
{
    system ("cls");
    int ub=0;
    struct Jugador jugadores;
    ofstream archivo;
    archivo.open("Jugadores.txt", ios::app);
    cout<<"Ingrese el nombre del jugador nuevo"<<endl;
    cin.getline(jugadores.nombre,20);
    fflush(stdin);
    cout<<"Ingrese el equipo del jugador"<<endl;
    cin.getline(jugadores.equipo,20);
    fflush(stdin);
    cout<<"Ingrese la categoria"<<endl;
    cin.getline(jugadores.categoria,20);
    fflush(stdin);
    if(buscar(jugadores.equipo)==-1)
    {
        cout<<"El nombre de "<<jugadores.equipo<<" no esta disponible"<<endl;
    }
    else
    {
        archivo.write((char*)&jugadores,sizeof(jugadores));
        archivo.close();
        cout<<"El jugador ha sido agregado corectamente"<<endl;
    }

}


void mostrarjug()
{
    system ("cls");
    Jugador jugadores;
    ifstream archivo("Jugadores.txt",ios::in);
    if(archivo.fail())
    {
        cout<<"No se pudo abrir el archivo"<<endl;
        exit(1);
    }
    string text, text1;
    cout<<"Ingrese el equipo del jugador"<<endl;
    cin>>text;
    fflush(stdin);
    cout<<"Ingrese la categoria"<<endl;
    cin>>text1;;
    fflush(stdin);
    if(buscar(text)!=-1)
    {
        cout<<"El equipo "<<jugadores.equipo<<" no esta disponible\n Intentelo de nuevo\n"<<endl;
        exit(1);
    }
    else
    {
        cout<<"Jugadores \t\t Equipo \t\t Categoria"<<endl;
        archivo.read((char*)&jugadores,sizeof(jugadores));
        while(archivo && !archivo.eof())
        {
            if(text==jugadores.equipo && text1==jugadores.categoria)
            {
                cout<<jugadores.nombre<<" \t\t\t"<<jugadores.equipo<<" \t\t\t"<<jugadores.categoria<<endl;

            }
            archivo.read((char*)&jugadores,sizeof(jugadores));
        }
        archivo.close();
        getch();
        system ("cls");
    }

}


void mostrar_eq()
{
    system ("cls");
    Equipo equipo;
    ifstream archivo("Equipo.txt",ios::in);
    cout<<endl<<endl<<endl;
    cout<<"\t****************(( EQUIPOS INGRESADOS ))****************"<<endl<<endl<<endl;
    if(archivo.fail())
    {
        cout<<"No se pudo abrir el archivo"<<endl;
        exit(1);
    }
    int i=0;
    archivo.read((char*)&equipo,sizeof(equipo));
    while(archivo && !archivo.eof())
    {
            cout<<equipo.nombre<<endl;
            archivo.read((char*)&equipo,sizeof(equipo));
   getch();
    }


}


void modificar_eq(string equipo2)
{
    system ("cls");
    int ub=0;
    Equipo equipo;
    ub=buscar(equipo2);
    if(ub==-1)
    {
        cout<<"No se puede encontrar el equipo, Intentelo de nuevo"<<endl;
        exit(1);
    }
    fflush(stdin);
    fstream archivo("Equipo.txt");
            cout<<endl<<endl;
            cout<<"\t***************(( Ingrese un nombre nuevo para el Equipo: ))***************** "<<endl;

            cout<<endl<<"\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
            cin.getline(equipo.nombre,20);
            fflush(stdin);
            archivo.clear();

            archivo.seekg((ub-1)*sizeof(equipo.nombre),ios::beg);
            archivo.write((char*)&equipo,sizeof(equipo));
            archivo.close();
}


