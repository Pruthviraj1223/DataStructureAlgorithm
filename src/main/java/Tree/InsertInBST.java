package Tree;

public class InsertInBST {

    public static void insert(int []data)
    {
        NodeUtil.insertBST(data);
    }

    public static void main(String[] args) {

        insert(new int[]{10,5,13,7,12,6});

    }
}
