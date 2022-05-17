import { expect } from 'chai';
import { bubbleSort } from '../..//code/sorting/src/bubble_sort/bubble_sort.js'
import {linearSearch} from '../..//code/search/src/linear_search/linear_search.js'

describe('bubble sort and linear search', () => {

    it('should return the index of the 7th greatest number after sorting an array', () => {
        const array = [5, 8, 0, 2, 7, 1, 4, 3, 9, 6];
        const sorted = bubbleSort(array);
        const x = linearSearch(sorted, 3);
        expect(x).to.be.eql(3);
    });
});