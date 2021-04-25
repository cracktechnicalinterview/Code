package PopularInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomProblem {

	public static int minMeetingRooms(float[][] intervals) {

		Arrays.sort(intervals, Comparator.comparing((float[] itv) -> itv[0]));
		PriorityQueue<Float> heap = new PriorityQueue<>();
		int count = 0;
		for (float[] itv : intervals) {
			if (heap.isEmpty()) {
				count++;
				heap.offer(itv[1]);
			} else {
				if (itv[0] >= heap.peek()) {
					heap.poll();
				} else {
					count++;
				}

				heap.offer(itv[1]);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		float meetings[][] = { { 9.0f, 10.50f }, { 11, 12.30f }, { 10.45f, 12.15f }, { 12, 1.30f } };
		System.out.println(minMeetingRooms(meetings));

	}

}
