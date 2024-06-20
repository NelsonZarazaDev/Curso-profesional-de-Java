public class Main {
    public static void main(String[] args) {

        int num[] = new int[6];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        System.out.println(num[0]);

        int array1[]={1,2,3,4,5,6};
        System.out.println(array1[0]);



        String nombre[]={"Nelson","Mauricio","Navarro","Zaraza"};
        int c=0;

        while(c < nombre.length){
            System.out.println(nombre[c]);
            c++;
        }


        for (String dato:nombre){
            System.out.println(dato);
        }

        int nume[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8}};

        for (int[] matriz : nume) {
            for (int dato : matriz) {
                System.out.println(dato);
            }
        }
    }
}