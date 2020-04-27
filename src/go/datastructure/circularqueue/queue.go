package circular

type MyCircularQueue struct {
	queue  []int
	size   int
	header int
	tail   int
}

/** Initialize your data structure here. Set the size of the queue to be k. **/
func Constructor(k int) MyCircularQueue {
	return MyCircularQueue{
		queue:  make([]int, k),
		size:   0,
		header: -1,
		tail:   -1,
	}
}

/** Insert an element into the circular queue. Return true if the operation is successful. */
func (this *MyCircularQueue) EnQueue(value int) bool {
	if this.IsFull() {
		return false
	}

	if this.IsEmpty() {
		this.header = 0
	}

	if this.tail == cap(this.queue)-1 {
		this.tail = 0
	} else {
		this.tail = this.tail + 1
	}

	this.queue[this.tail] = value
	this.size++
	return true
}

/** Delete an element from the circular queue. Return true if the operation is successful. */
func (this *MyCircularQueue) DeQueue() bool {
	if this.IsEmpty() {
		return false
	}

	if this.tail == this.header {
		this.size--
		this.header = -1
		this.tail = -1
		return true
	}

	if this.header != cap(this.queue)-1 {
		this.header++
	} else {
		this.header = 0
	}
	this.size--
	return true
}

/** Get the front item from the queue. */
func (this *MyCircularQueue) Front() int {
	if this.IsEmpty() {
		return -1
	}

	return this.queue[this.header]
}

/** Get the last item from the queue. */
func (this *MyCircularQueue) Rear() int {
	if this.IsEmpty() {
		return -1
	}

	return this.queue[this.tail]
}

/** Checks whether the circular queue is empty or not. */
func (this *MyCircularQueue) IsEmpty() bool {
	return this.size == 0
}

/** Checks whether the circular queue is full or not. */
func (this *MyCircularQueue) IsFull() bool {
	return this.size == cap(this.queue)
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * obj := Constructor(k);
 * param_1 := obj.EnQueue(value);
 * param_2 := obj.DeQueue();
 * param_3 := obj.Front();
 * param_4 := obj.Rear();
 * param_5 := obj.IsEmpty();
 * param_6 := obj.IsFull();
 */
