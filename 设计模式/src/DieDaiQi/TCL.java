package DieDaiQi;

public class TCL implements Tv {
	private Object[] obj = {"��������","��������","��Ϸ����","��������"};
	@Override
	public TvIterator creatIterator() {
		// TODO �Զ����ɵķ������
		return new TCLIterator();
	}
	class TCLIterator implements TvIterator{
		private int currentIndex=0;
		@Override
		public void setChannel(int i) {
			// TODO �Զ����ɵķ������
			currentIndex=i;
		}

		@Override
		public void next() {
			// TODO �Զ����ɵķ������
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			// TODO �Զ����ɵķ������
			if(currentIndex>0)
				currentIndex--;
		}

		@Override
		public boolean isLast() {
			// TODO �Զ����ɵķ������
			return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO �Զ����ɵķ������
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO �Զ����ɵķ������
			return currentIndex==0;
		}
	}
}
