#include<iostream>

using namespace std;

class Hello
{
    public:
    void fun();

};

class Demo
{
    public:
    int i;
    private:
    int j;
    protected:
    int k;
    
    public:
    Demo()
    {
        i=10;
        j=20;
        k=30;
    }
    
    friend void Hello::fun();
    
};

    void Hello:: fun()
    { 
        Demo obj1;
        cout<<obj1.i<<endl;
        cout<<obj1.j<<endl;
        cout<<obj1.k<<endl;
        
    }



int main()
{
    Hello hobj;
    hobj.fun();
    return 0;
}