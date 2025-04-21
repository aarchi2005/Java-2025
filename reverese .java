class hello{
    public static void main(String[] args) {
        int [ ] ar1 ={ 1,2,3,4,5};
        int [ ] ar2={1,2,3,4,5};
        int [] sum =new int [ar1.length];

        for (int i=0; i<=ar1.length ; i ++){
        sum [i] = ar1[i]+ ar2[i];
        
        
        System.out.println("sum is : "+sum );
        
    }
}
}
