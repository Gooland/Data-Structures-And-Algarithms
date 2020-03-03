
public class List {

	
protected Node top, bottom;
protected int size;

public List()
{
	top = null;
	bottom = null;
	size = 0;
	
}

public List(String g)
{
	top = new Node(g);
	bottom = top;
	size = 1;
	
}

public void addOnTop(String m)
{
	Node temp= new Node(m, top);
	top = temp;
	if(bottom == null)
	bottom = temp;
	size++;
	
}

public void addOnBottom(String m)
{
	Node temp = new Node(m);
	if(bottom != null)
		bottom.setNext(temp);
	else
		top = temp;
	bottom = temp;
	size++;
}

public void insertAt(int loc, String val) {
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

public void addBefore(String nv, String b)
{
	int i =linearSearch(b);
	if(i==-1)
		addOnBottom(nv);
	else
		insertAt(i, nv);
}

public void addAfter(String nv, String b)
{
	int i =linearSearch(b);
	if(i==-1)
		addOnBottom(nv);
	else
		insertAt(i+1, nv);
}

public boolean contains(String val)
{
	return linearSearch(val)>=0;
}

private int linearSearch(String key)
{
	Node n= top;
	int i =0;
	while(n!=null)
		{
			if(n.getValue().equals(key))
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






