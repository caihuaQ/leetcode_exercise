//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 
// 👍 2128 👎 0


package leetcode.editor.cn;

/**
 * 删除链表的倒数第 N 个结点
 * @author caiwenjian
 * @date 2022-07-17 00:03:09
 */
public class P19_RemoveNthNodeFromEndOfList{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

//  Definition for singly-linked list.
  public class ListNode {
	int val;
	  ListNode next;
	  ListNode() {}
	  ListNode(int val) { this.val = val; }
	  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	//执行时间：0 ms 超100.00% 消耗内存：39.2 MB 超97.66%
		//设一个结点指向首结点
		ListNode first = new ListNode(0,head);
		//cur用于遍历找到倒数第n个结点的前一个结点
		ListNode cur = first;
		//算长度
		int length = 0;
		while (head != null){
			length += 1;
			head = head.next;
		}
		//1->2->3->4->5
		//找倒数第n个的前一个
		for (int i = 0; i < length-n; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		return first.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}