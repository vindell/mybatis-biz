package cn.ms.sequence;

import org.apache.ibatis.utils.uid.Sequence;
import org.junit.Test;

public class SequenceTest1 {

	@Test
	public void name() {
		Sequence sequence = new Sequence(0, 0);
		for (int i = 0; i < 1000; i++) {
			long id = sequence.nextId();
			System.out.println(id);
		}
	}

}
