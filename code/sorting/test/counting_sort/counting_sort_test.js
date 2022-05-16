import { expect } from 'chai';
import { countingSort } from '../../src/counting_sort/counting_sort.js'

describe('counting sort algorithm', () => {

    it('should return a sorted array given all elemenents are unique', () => {
        const array = [5, 8, 10, 2, 7, 1, 4, 3, 9, 6];

        const sorted = countingSort(array, 1, 10);

        expect(sorted).to.be.eql([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
    });

    it('should return a sorted array given an array with duplicate elements', () => {
        const array = [6, 4, 2, 1, 4, 9, 4, 7, 1, 9, 7, 4, 8, 1, 5, 9, 5, 2, 10, 5];

        const sorted = countingSort(array, 1, 10);

        expect(sorted).to.be.eql([1, 1, 1, 2, 2, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7, 8, 9, 9, 9, 10]);
    });
});