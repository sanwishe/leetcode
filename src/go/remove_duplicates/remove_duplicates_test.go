package remove_duplicates

import (
	"testing"
	"fmt"
)

func TestRemove_duplicates(t *testing.T) {
	//given
	nums := []int{0,0,1,1,1,2,2,3,3,4}
	expect := 5

	//when
	act := removeDuplicates(nums)

	//then
	fmt.Printf("act=%d, expect=%d, res=%v", act, expect, expect == act)
}
