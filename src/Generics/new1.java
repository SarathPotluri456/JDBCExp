package Generics;

public class new1<E> {
	
		E eid;
		E ename;
		
		
		public new1(E eid, E ename) {
		
			this.eid = eid;
			this.ename = ename;
		}
		
		
		/*public E getEid() {
			return eid;
		}
		public void setEid(E eid) {
			this.eid = eid;
		}
		public E getEname() {
			return ename;
		}
		public void setEname(E ename) {
			this.ename = ename;
		}*/


		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + "]";
		}
		
		
		
		 
	       
	}

