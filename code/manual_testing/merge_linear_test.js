import { expect } from 'chai';
import { mergeSort } from '../..//code/sorting/src/merge_sort/merge_sort.js'
import {linearSearch} from '../..//code/search/src/linear_search/linear_search.js'

describe('merge sort and linear search', () => {

    it('should return the index of the 4th greatest number after sorting an array', () => {
        const array = [5, 8, 0, 2, 7, 1, 4, 3, 9, 6];
        const sorted = mergeSort(array);
        const x = linearSearch(sorted, 6);
        expect(x).to.be.eql(6);
    });
});