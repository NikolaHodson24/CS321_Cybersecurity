package cs321.btree;

import java.io.IOException;
import java.io.PrintWriter;

public class BTree implements BTreeInterface
{

    private int degree;
    private Node<TreeObject> root;


    public BTree(int degree){
        this.degree = degree;
        root = null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public int getDegree() {
        return degree;
    }

    @Override
    public long getNumberOfNodes() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void insert(TreeObject obj) throws IOException {

    }

    @Override
    public void dumpToFile(PrintWriter out) throws IOException {

    }

    @Override
    public void dumpToDatabase(String dbName, String tableName) throws IOException {

    }

    @Override
    public TreeObject search(String key) throws IOException {
        return null;
    }

    @Override
    public void delete(String key) {

    }
}
