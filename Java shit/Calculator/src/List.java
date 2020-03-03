
public class List {

	
protected Node top, bottom;
protected int size;

public List()
{
	top = null;
	bottom = null;
	size = 0;
	
}

public List(int g)
{
	top = new Node(g);
	bottom = top;
	size = 1;
	
}

public void addOnTop(int m)
{
	Node temp= new Node(m, top);
	top = temp;
	if(bottom == null)
	bottom = temp;
	size++;
	
}

public void addOnBottom(int m)
{
	Node temp = new Node(m);
	if(bottom != null)
		bottom.setNext(temp);
	else
		top = temp;
	bottom = temp;
	size++;
}

public void insertAt(int loc, int val) {
	if(loc >= size) {
		addOnBottom(val);
		return;
	}
	if(loc == 0) {
		addOnTop(val);
		return;
	}
	Node temp = top;
	for(int i = 1; i < loc; i++) {
		temp = temp.getNext();
	}
	Node newValue = new Node(val, temp.getNext());
	temp.setNext(newValue);
	size++;
}

public void addBefore(int nv, int b)
{
	int i =linearSearch(b);
	if(i==-1)
		addOnBottom(nv);
	else
		insertAt(i, nv);
}

public void addAfter(int nv, int b)
{
	int i =linearSearch(b);
	if(i==-1)
		addOnBottom(nv);
	else
		insertAt(i+1, nv);
}

public int getSize() {
	return size;
}

public int getTopVal()
{
	return top.value;
}

public boolean contains(int val)
{
	return linearSearch(val)>=0;
}

private int linearSearch(int key)
{
	Node n= top;
	int i =0;
	while(n!=null)
		{
			if(n.getValue() ==key)
			{
				return i;
			}
			i++;
			n=n.getNext();
		}
	return -1;
}

public void deleteTop()
{
	if(top == null)
		return;
	top = top.getNext();
	if(top==null)
		bottom=null;
	size--;
}

public void deleteBottom()
{
	if(bottom ==null)
		return;
	if(top==bottom)
	{
		top=null;
		bottom=null;
		size--;
		return;
	}
	Node temp = top;
	while(temp!=null&& temp.getNext()!=bottom)
	{
		temp = temp.getNext();
	}
	temp.setNext(null);
	bottom=temp;
	size--;
}
}






