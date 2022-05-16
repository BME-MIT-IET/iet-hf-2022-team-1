import { expect } from 'chai';
import { bogosort } from '../../src/bogo_sort/bogo_sort.js'

describe('bogo sort algorithm', () => {

    it('should return a sorted array given all elemenents are unique', () => {
        const array = [5, 8, 10, 2, 7, 1, 4, 3, 9, 6];

        const sorted = bogosort(array);

        expect(sorted).to.be.eql([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
    });

    it('should return a sorted array given an array with duplicate elements', () => {
        const array = [5, 1, 4, 3, 2, 3, 2, 4, 5, 4];

        const sorted = bogosort(array);

        expect(sorted).to.be.eql([1, 2, 2, 3, 3, 4, 4, 4, 5, 5]);
    });
});