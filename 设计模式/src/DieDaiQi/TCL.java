package DieDaiQi;

public class TCL implements Tv {
	private Object[] obj = {"湖南卫视","北京卫视","游戏风云","湖北卫视"};
	@Override
	public TvIterator creatIterator() {
		// TODO 自动生成的方法存根
		return new TCLIterator();
	}
	class TCLIterator implements TvIterator{
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
