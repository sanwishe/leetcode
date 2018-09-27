package find_median

import (
	"testing"
	"fmt"
)

func TestFindMedianSortedArrays1(t *testing.T) {
	//given
	nums1 := []int{1, 4, 6, 7}
	nums2 := []int{2, 3, 5, 8}
	expect := 4.5

	//when
	act := findMedianSortedArrays(nums1, nums2)

	//then
	fmt.Printf("expect = %f, act = %f\n", expect, act)
}

func TestFindMedianSortedArrays2(t *testing.T) {
	//given
	nums1 := []int{1, 3, 8}
	nums2 := []int{2, 4, 5, 7, 9}
	expect := 4.5

	//when
	act := findMedianSortedArrays(nums1, nums2)

	//then
	fmt.Printf("expect = %f, act = %f\n", expect, act)
}

func TestFindMedianSortedArrays3(t *testing.T) {
	//given
	nums1 := []int{1, 3}
	nums2 := []int{2}
	expect := 2

	//when
	act := findMedianSortedArrays(nums1, nums2)

	//then
	fmt.Printf("expect = %v, act = %f\n", expect, act)
}
