package listen;

public interface IList {

	public void insertAt(int n, int pos);
	public void removeAt(int pos);
	public int getAt(int pos);
	public int search(int n);
	public void clear();
	public int getCount();

}
