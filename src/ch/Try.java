package ch;

class BasicBlob { // (1)
	static int idCounter;
	static int population;
	protected int blobId;
	BasicBlob() {
	blobId = idCounter++;
	++population;
	}
	protected void finalize() throws Throwable { // (2)
	--population;
	super.finalize();
	}
	}
	//______________________________________________________________________________
	class Blob extends BasicBlob { // (3)
	int[] size;
	Blob(int bloatedness) { // (4)
		size = new int[bloatedness];
		System.out.println(blobId + ": Hello");
		}
		protected void finalize() throws Throwable { // (5)
		System.out.println(blobId + ": Bye");
		super.finalize();
		}
		}
		//_______________________________________________________________________________
		public class Try {
		public static void main(String[] args) { // (6)
		int blobsRequired, blobSize;
		Blob b=new Blob(4);
		
		try {
		blobsRequired = 5;//Integer.parseInt(args[0]);
		blobSize = 5000000;//Integer.parseInt(args[1]);
		} catch(IndexOutOfBoundsException e) {
		System.err.println("Usage: Finalizers <number of blobs> <blob size>");
		return;
		}
		for (int i=0; i<blobsRequired; ++i) { // (7)
		new Blob(blobSize);
		}
		System.out.println(BasicBlob.population + " blobs alive"); // (8)
		}
		}