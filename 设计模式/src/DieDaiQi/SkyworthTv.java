package DieDaiQi;

public class SkyworthTv implements Tv{
	private Object[] obj = {"CCTV-1","CCTV-2","CCTV-3","CCTV-4"};
	public TvIterator creatIterator() {
		return new SkyworthIterator();
	}
	private class SkyworthIterator implements TvIterator{
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
