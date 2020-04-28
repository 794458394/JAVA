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
			// TODO 自动生成的方法存根
			currentIndex=i;
		}

		@Override
		public void next() {
			// TODO 自动生成的方法存根
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			// TODO 自动生成的方法存根
			if(currentIndex>0)
				currentIndex--;
		}

		@Override
		public boolean isLast() {
			// TODO 自动生成的方法存根
			return currentIndex==obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO 自动生成的方法存根
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO 自动生成的方法存根
			return currentIndex==0;
		}
		
	}
}
