public class InverterArray { 
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  

   
        System.out.println("Array original:"); 
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " "); 
        }
        System.out.println();  

        int valortroca; 
        int n = array.length;
      int i;                  
        for ( i = 0; i < n / 2; i++) {  
           
            valortroca = array[i]; 
            array[i] = array[n - 1 - i]; 
            array[n - 1 - i] = valortroca;  
        }

       
        System.out.println("Array invertido:");  
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); 
        }
    }
}
