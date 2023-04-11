package test;

public class TestSequenceTable<T> {
	public static final int MAXSIZE = 10;

	Object[] data;

	int length;

	public TestSequenceTable() {
	}

	public void initList() {
		this.data = new Object[MAXSIZE];
		if (this.data == null) {
			throw new OutOfMemoryError();
		}
		this.length = 0;
	}

	public boolean emptyList() {
		return this.length == 0;
	}

	public void clearList() {
		for (int i = 0; i < this.length; i++) {
			this.data[i] = null;
		}
	}

	@SuppressWarnings("unchecked")
	public T getElem(int index) {
		if (index < 0 || index >= this.length) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + this.length);
		}
		return (T) this.data[index];
	}

	@SuppressWarnings("hiding")
	public <T> int locateElem(T data) {
		for (int index = 0; index < this.length; index++) {
			if (this.data[index].equals(data)) {
				return index;
			}
		}
		return -1;
	}

	@SuppressWarnings("hiding")
	public <T> void insertList(int index, T data) {
		if (this.length >= MAXSIZE) {
			throw new OutOfMemoryError();
		}
		if (index < 0 || index > this.length) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + this.length);
		}
		for (int i = this.length; i > index; i--) {
			this.data[i] = this.data[i - 1];
		}
		this.data[index] = data;
		this.length++;
	}

	public T listDelete(int index) {
		if (index < 0 || index >= this.length) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + this.length);
		}
		@SuppressWarnings("unchecked")
		T data = (T) this.data[index];
		for (int i = index; i < this.length; i++) {
			this.data[i] = this.data[i + 1];
		}
		this.length--;
		return data;
	}

	public int listLength() {
		return this.length;
	}

	public void listAll() {
		for (int i = 0; i < this.length; i++) {
			System.out.println("第" + i + "个元素是:" + this.data[i] + "\n");
		}
	}
}