import { expect } from 'chai';
import { quickSort } from '../..//code/sorting/src/quick_sort/quick_sort.js'
import {linearSearch} from '../..//code/search/src/linear_search/linear_search.js'

describe('quick sort and linear search', () => {

    it('should return the index of the 8th greatest number after sorting an array', () => {
        const array = [5, 8, 0, 2, 7, 1, 4, 3, 9, 6];
        const sorted = quickSort(array, 0, 9);
        const x = linearSearch(sorted, 2);
        expect(x).to.be.eql(2);
    });
});