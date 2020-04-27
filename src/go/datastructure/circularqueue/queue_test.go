package circular

import (
	"fmt"
	"testing"
)

func TestMyCircularQueue(t *testing.T) {
	queue := Constructor(3)

	fmt.Println(queue.IsEmpty())  // true
	fmt.Println(queue.IsFull())   // false
	fmt.Println(queue.EnQueue(1)) // true
	fmt.Println(queue.EnQueue(2))
	fmt.Println(queue.EnQueue(3))
	fmt.Println(queue.EnQueue(4)) // false
	fmt.Println(queue.DeQueue())  // true
	fmt.Println(queue.Front())    // 2
	fmt.Println(queue.Rear())     // 3
	fmt.Println(queue.EnQueue(4)) // true
	fmt.Println(queue.Front())    // 2
	fmt.Println(queue.Rear())     // 4
	fmt.Println(queue.IsFull())   // true
}
