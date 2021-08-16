#include <iostream>
#include <stdlib.h>
#include <windows.h>
using namespace std;

// RESTAURANT's MENU FUNCTION
int menu()
{

    int menuSelector;
    int subMenuSelector;
    int price = 0;

    system("CLS");
    cout << "\t\t\t\t\t\t     ----------     KING CHICKEN     --------        " << endl;
    cout << " \n\n \t   -----------   MENU   ----------      " << endl<<endl;

    cout << "    --------- NO.1:  CHICKEN   BIRYANI --------         " << endl;
    cout << "    --------- NO.2:  CHICKEN   RICE    --------         " << endl;
    cout << "    --------- NO.3:  CHICKEN   BURGER  --------         " << endl;
    cout << "    --------- NO.4:  CHICKEN   KARAI   --------         " << endl;
    cout << "    --------- NO.5:  COCA COLA (2.25)  --------         " << endl
         << endl;

    cout << " PLEASE SELECT THE ORDER NUMBER : ";
    cin >> menuSelector;

    if (menuSelector == 1)
    {
        system("CLS");
        cout << "\n  ORDER :  CHICKEN BIRYANI     " << endl<<endl;

        cout << "  NO. 1 :  FULL BIRYANI ----- RS: 250   " << endl;
        cout << "  NO. 2 :  HALF  BIRYANI----- RS :150   " << endl
             << endl;
        cout << "  CHOOSE NO.1 OR  NO. 2 : ";
        cin >> subMenuSelector;

        if (subMenuSelector == 1)
        {
            cout << "------ FULL BIRAYANI ---- ";
            price += 250;
        }
        else if (subMenuSelector == 2)
        {
            cout << "------ HALF BIRAYANI ---- ";
            price += 150;
        }
        else
        {
            cout << " !!!!!!! YOU ENTERED AN INVALID CHOICE !!!!!!!  ";
        }
    }
    else if (menuSelector == 2)
    {
        system("CLS");
        cout << "\n  ORDER :  CHICKEN   RICE      " << endl
             << endl;

        cout << "  NO. 1 :  FULL  PLATE ----- RS: 200   " << endl;
        cout << "  NO. 2 :  HALF  PLATE ----- RS :120   " << endl
             << endl;
        cout << "  CHOOSE NO.1 OR  NO. 2 : ";
        cin >> subMenuSelector;

        if (subMenuSelector == 1)
        {
            cout << "------   FULL PLATE   ------" << endl;
            price += 200;
        }
        else if (subMenuSelector == 2)
        {
            cout << "------   HALF PLATE   ------" << endl;
            price += 120;
        }
        else
        {
            cout << " !!!!!!! YOU ENTERED AN INVALID CHOICE !!!!!!!  ";
        }
    }
    else if (menuSelector == 3)
    {
        system("CLS");
        cout << "\n  ORDER :    BURGER    " << endl<<endl;
        cout << "  NO. 1 :  ZINGER BURGER ------ RS: 200  " << endl;
        cout << "  NO. 2 :  CHICKEN BURGER ------ RS: 130 " << endl
             << endl;
        cout << "  CHOOSE NO.1 OR  NO. 2 : ";
        cin >> subMenuSelector;

        if (subMenuSelector == 1)
        {
            cout << "------   ZINGER BURGER   ------" << endl;
            price += 200;
        }
        else if (subMenuSelector == 2)
        {
            cout << "------   CHIKEN BURGER   ------" << endl;
            price += 130;
        }
        else
        {
            cout << " !!!!!!! YOU ENTERED AN INVALID CHOICE !!!!!!!  ";
        }
    }
    else if (menuSelector == 4)
    {
        system("CLS");
        cout << "\n  ORDER :  CHICKEN   KARAHI    " << endl<<endl;
        cout << "  NO. 1 :  CHICKEN KARAHI FULL ------ RS: 800  " << endl;
        cout << "  NO. 2 :  CHICKEN KARAHI HALF ------ RS: 500 " << endl
             << endl;
        cout << "  CHOOSE NO.1 OR  NO. 2 : ";
        cin >> subMenuSelector;

        if (subMenuSelector == 1)
        {
            cout << "------   CHICKEN KARAHI FULL   ------" << endl;
            price += 800;
        }
        else if (subMenuSelector == 2)
        {
            cout << "------   CHIKEN KARAHI HALF   ------" << endl;
            price += 500;
        }
        else
        {
            cout << " !!!!!!! YOU ENTERED AN INVALID CHOICE !!!!!!!  ";
        }
    }
    else if (menuSelector == 5)
    {
        system("CLS");
        cout << "\n  ORDER :  DEW / SPRITE (PLZ AVOID COCA COLA!)    " << endl<<endl;
        cout << "  NO. 1 :  2.5 LITRE ------ RS: 120  " << endl;
        cout << "  NO. 2 :  1.5 LITRE ------ RS: 100 " << endl
             << endl;
        cout << "  CHOOSE NO.1 OR  NO. 2 : ";
        cin >> subMenuSelector;

        if (subMenuSelector == 1)
        {
            cout << "------   2.5 LITRE   ------" << endl;
            price += 120;
        }
        else if (subMenuSelector == 2)
        {
            cout << "------   1.5 LITRE   ------" << endl;
            price += 100;
        }
        else
        {
            cout << " !!!!!!! YOU ENTERED AN INVALID CHOICE !!!!!!!  ";
        }
    }
    else
    {
        system("CLS");
        cout << " !!!!!!     OUT OF ORDER     !!!!!!" << endl;
    }

    return price;
}

int main()
{

    int commingPrice = 0;

    commingPrice += menu();
    
    for (int i = 0; i < 1; i)
    {

        if (commingPrice == 0)
        {
            cout << "\n\n     !-!-!-!-! PLZ CHOOSE AGAIN !-!-!-!-!" << endl;
            Sleep(2000);
            commingPrice += menu();
        }
        else
        {
            char ch;
            cout << "\n     ------ ARE YOU WANT TO ORDER MORE ? ------ " << endl;
            cout << "     \t \t ------ IF ORDER MORE THEN PRESS 'y' OTHER-WISE PRESS 'n' TO SHOW TOTAL BILL ------ " << endl;
            cout << "\n\n     ------ ENTER YOUR CHOISE = ";
            cin >> ch;

            if (ch == 'y')
            {
                commingPrice += menu();
            }
            else
            {
                system("CLS");
                cout << "\n\n\n \t\t\t\t\t\t\t ------>>>>>     YOUR BILL   =====  " << commingPrice << endl
                     << endl
                     << endl;
                Sleep(2000);
                cout << "\n\n \t\t\t\t\t\t\t          **********     THANK YOU , YOUR ORDER WILL BE READY WITHIN FEW MUNITES     **********" << endl;
                cout << "\t\t\t\t\t\t\t                                                      \v All Rights Reserved \xa9JarvizProduction"<<endl
                     << endl;
                Sleep(3000);
                break;
            }
        }
    }

    return 0;
}
