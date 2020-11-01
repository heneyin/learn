package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {
	var x, y int = 3, 4
	var f float64 = math.Sqrt(float64(x*x + y*y))
	var z uint = uint(f)
	fmt.Println(x, y, z)

	// string array 转为 int array
	var t = []string{"1", "2", "3"}
	var t2 = []int64{}

	for _, i := range t {
		// j, err := strconv.Atoi(i)
		j, err := strconv.ParseInt(i, 0, 64)
		if err != nil {
			panic(err)
		}
		t2 = append(t2, j)
	}

	fmt.Println(t2)

}
