package ex_1;

public interface Iterator<T> {
	public boolean hasNext();
	public T next();
	public void reset();
}
