package cm.cosingblocks;

public class HeapClient {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(234);
        heap.insert(54);
        heap.insert(35);
        heap.insert(89);


        System.out.println(heap.heapSort());

    }
}
