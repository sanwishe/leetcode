package find_median

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	newlen := 1 + (len(nums1)+len(nums2))/2
	var newArr = make([]int, newlen)

	pos1, pos2 := 0, 0
	for i := 0; i < newlen; i++ {
		if pos1 < len(nums1) && pos2 < len(nums2) && nums1[pos1] < nums2[pos2] {
			newArr[i] = nums1[pos1]
			pos1 ++
		} else if pos2 < len(nums2) {
			newArr[i] = nums2[pos2]
			pos2 ++
		} else if pos1 < len(nums1) {
			newArr[i] = nums1[pos1]
			pos1 ++
		}
	}

	if (len(nums1)+len(nums2))%2 == 1 {
		return float64(newArr[newlen-1])
	} else {
		return float64(newArr[newlen-1]+newArr[newlen-2]) / 2.0
	}
}
