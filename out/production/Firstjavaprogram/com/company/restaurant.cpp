#include<iostream>
using namespace std;
 main()
{
    cout<<"     ----------KING CHICKEN--------        ";

    cout<<" \n\n      -----------MENU----------      "<<endl;

       int a ;
    
     cout<<"    --------- NO.1:  CHICKEN   BIRYANI --------         "<<endl ;
     cout<<"    --------- NO.2:  CHICKEN   RICE    --------         " <<endl;
     cout<<"    --------- NO.3:  CHICKEN   BURGER  --------         " <<endl;
     cout<<"    --------- NO.4:  CHICKEN   KARAI   --------         " <<endl;
     cout<<"    --------- NO.5:  COCA COLA (2.25)  --------         " <<endl;
     cout<<" PLEASE SELECT THE ORDER NUMBER : ";
           cin>> a; 

       
      int biryani;
     if (a==1)
     {
         cout<<"  ORDER :  CHICKEN BIRYANI     "<<endl ;
        
         cout<<"  NO. 1 :  FULL BIRYANI ----- RS: 250   "<<endl ;
         cout<<"  NO. 2 :  HALF  BIRYANI----- RS :150   "<<endl ;
         cout<<"  CHOOSE NO.1 OR  NO. 2 : " ;
               cin>>biryani;
               
        if (biryani==1)
     {
         cout<< "------ FULL BIRAYANI ---- ";
         
     }
      else if (biryani==2)
      {
          cout<< "------ HALF BIRAYANI ---- ";
      }
      
     else{
            cout<<" YOU ENTERED AN INVALID CHOICE ";
    
    }

     }
     



        int rice ;
     if (a==2){
         cout<<"  ORDER :  CHICKEN   RICE      " <<endl<<endl;
         cout<<"  NO. 1 :  FULL  PLATE ----- RS: 250   "<<endl ;
         cout<<"  NO. 2 :  HALF  PLATE ----- RS :150   "<<endl<<endl ;
         cout<<"  PLEASE ENTER YOUR CHOICE :   " ;
         cin>> rice;

        if (rice==1)
        {
            cout<<" FULL PLATE "<<endl;
        }
         else if (rice==2){
         cout<<" HALF PLATE "<<endl;
       
         }
        else {

        cout <<" YOU ENTERED AN INVALID CHOICE "<<endl;
    
        }
     }

        int burger;
      if (a==3)
    {
         cout<<"  ORDER :  CHICKEN   BURGER    " <<endl;
         cout<<"  NO. 1 :  ZINGER  "<<endl ;
         cout<<"  NO. 2 :  CHICKEN "<<endl<<endl ;
         cout<<"  PLEASE ENTER YOUR CHOICE :   " ;
        cin>> burger;
        if (burger==1)
        {
                cout<<" ZINGER BURGER "<<endl;

       }
        else if (burger==2)
        {
                cout<<" CHICKEN BURGER "<<endl;
        }
        else 
        {
              cout <<" YOU ENTERED AN INVALID CHOICE "<<endl;
        }
    }
        int karai;
     if (a==4)
    {
        cout<<"   ORDER : CHICKEN   KARAI      " <<endl;
        cout<<"  NO. 1 :  CHICKEN KARAI FULL --- 500  "<<endl ;
        cout<<"  NO. 2 :  CHICKEN KARAI HALF --- 350"<<endl<<endl ;
        cout<<"  PLEASE ENTER YOUR CHOICE :   " ;
                   cin>>karai;
        
        if (karai==1)
        {
         cout<<" FULL PLATE--- RS(500) "<<endl;
        }
         else if (karai==2){
         cout<<" HALF PLATE --- Rs(350)"<<endl;
       
         }
        else {

        cout <<" YOU ENTERED AN INVALID CHOICE "<<endl;
    
        }
    
    
    }







        int coca;
     if (a==5)
     {
         cout<<"  ORDER :  COCA COLA BOTTLE   " <<endl;
         cout<<"  NO. 1 : ---- 2.25 LITRE----  "<<endl ;
         cout<<"  NO. 2 : ---- 1.5 LITRE ----   "<<endl<<endl ;
         cout<<"  PLEASE ENTER YOUR CHOICE :   " ;
                cin>>coca;
        if (coca==1)
        {
            cout<<" 2.25 "<<endl;
        }
         else if (coca==2){
         cout<<" 1.5 LITRE "<<endl;
       
         }
        else {

        cout <<" YOU ENTERED AN INVALID CHOICE "<<endl;
    
        }
    
    
    
     }
     else{
         cout<< " YOU ENTERES AN INVALID CHOICE ";
     }


















    cout<<" ------ THANK YOU FOR COMMING ------";


    return 0;
}

