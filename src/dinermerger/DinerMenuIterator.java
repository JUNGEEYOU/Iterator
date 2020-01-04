package dinermerger;
import java.util.Iterator;

// DinerMenuIterator: list 형태로 Iterator 정의
public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;

	// 1. 음식메뉴들을 초기화
	public DinerMenuIterator(MenuItem[] items)
	{
		this.list = items;
	}
	// 2. next(): 다음 음식 메뉴를 리턴
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}

	// 3. hasNext(): 다음 메뉴가 존재하는지 boolean 리턴
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
    // 4. remove()
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
					("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}

