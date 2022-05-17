import { expect } from 'chai';
import { quickSort } from '../../src/quick_sort/quick_sort.js'

describe('quick sort algorithm', () => {

    it('should return a sorted array given all elemenents are unique', () => {
        const array = [5, 8, 10, 2, 7, 1, 4, 3, 9, 6];

        const sorted = quickSort(array, 0, array.length - 1);

        expect(sorted).to.be.eql([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
    });

    it('should return a sorted array given an array with duplicate elements', () => {
        const array = [6, 4, 2, 1, 4, 9, 4, 7, 1, 9, 7, 4, 8, 1, 5, 9, 5, 2, 10, 5];

        const sorted = quickSort(array, 0, array.length - 1);

        expect(sorted).to.be.eql([1, 1, 1, 2, 2, 4, 4, 4, 4, 5, 5, 5, 6, 7, 7, 8, 9, 9, 9, 10]);
    });

    it('should return a sorted array given an array with duplicate and negative elements', () => {
        const array = [4, -4, -3, -2, 1, -1, -1, -2, -3, -5, 1, -2, 1, -3, 0, 2, 1, 4, -3, -2];

        const sorted = quickSort(array, 0, array.length - 1);

        expect(sorted).to.be.eql([-5, -4, -3, -3, -3, -3, -2, -2, -2, -2, -1, -1, 0, 1, 1, 1, 1, 2, 4, 4]);
    });
});