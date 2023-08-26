package Search;


class list {
 int size;
 int list[];
 int list2[];
 static int end=-1;
 list()
 {
     size=2;
     
     list=new int[size];
     
 }
 void insert(int value)
 {    if(end!=size-1)
 {
     list[++end]=value;
 }
 else
	 increase_list_capacity(value);
     
 }
	 
 void increase_list_capacity(int value)
 {
	 list2=new int[list.length*2];
	 for(int i=0;i<=end;i++)
	 {
		 list2[i]=list[i];
		 
	 }
	 
	 list=list2;
	 size=list.length;
	 list[++end]=value;
	 
	 
 }


 
 
 int linearsearch(int value)
 {
     for(int i=0;i<=end;i++)
     {
         if(list[i]==value)
         {
             return i;
             
         }

     }
     return -1;
 }
 
 int binarySearch( int l, int r, int x)
{
 while (l <= r) {
     int m = (l + r)/ 2;

     // Check if x is present at mid
     if (list[m] == x)
         return m;

     // If x greater, ignore left half
     if (list[m] < x)
         l = m + 1;

     // If x is smaller, ignore right half
     else
         r = m - 1;
 }

 // if we reach here, then element was
 // not present
 return -1;
}
 
 public static void main(String[] args) {
         list l1=new list();
         int key;
         l1.insert(10);
         l1.insert(20);
         l1.insert(30);
         l1.insert(40);
         l1.insert(50);
         l1.insert(60);
         l1.insert(70);
         l1.insert(8);
         key=60;
         System.out.println(key+" is found at index:" +l1.linearsearch(key));
         System.out.println(key+" is found at index:" +l1.binarySearch(0,end,key));
         
         



 }
}
