
// class Sorting{
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");  
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {7,8,3,1,2};

        // // BUBBLE SORT - compare adjacents and push the largest at end, TC = n^2
        // // loop for traversing n values
        // for(int i = 0; i < arr.length-1; i++){
        //     // loop for traversing n-i-1 values ; last element gets sorted(exluded)            
        //     for(int j = 0; j < arr.length-i-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             // swapping
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         } 
        //     }
        // }printArray(arr);

        // // SELECTION SORT - select smallest and put in first by swapping with indexes(0,1,2...n)
        // // TC = O(n^2)
        // for(int i = 0; i < arr.length-1; i++){
        //     int smallest = i;
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }
        //         int temp = arr[smallest];
        //         arr[smallest] = arr[i];
        //         arr[i] = temp;
        // }
        // printArray(arr);
         
//         // INSERTION SORT
//         for(int i = 1; i < arr.length; i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }

//     printArray(arr);

//     }
// } 




