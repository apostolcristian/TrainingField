package com.company.algorithms.hashtables;


/** Hash Tables
 * Abstract data type
 * Provide Access to data using keys
 * Key doesn't have to be an integer
 * Consists of key/value pairs - data types don't have to match
 * Optimized for retrieval(when you know the key)
 * Associative array is one type of has table
 *
 * * Hashing
 * Maps keys of any data type to an integer
 * Hash function maps keys to int
 * In java, hash function is Object.hashCode()
 * Collision occurs when more than one value has the same hashed value
 *
 * * Load Factor
 * Tells us how full a hash table is
 * Load factor = $ of items / capacity = size / capacity
 * Load factor is used to decide when to resize the array backing the hash table
 * Don't want load factor too low (lots of empty space)
 * Don't want load factor too high (will increase the likelihood of collisions)
 * Can play a role in determining the time complexity for retrieval
 *
 * * Add to a Hash Table backed by an array
 * 1) Provide a key/value pair
 * 2) Use a sash function to hash the key to an int value
 * 3) Store the value at the hashed key value - his is the index into the array
 *
 * * Retrieve a value from a hash table
 * 1) Provide the key
 * 2) Use the same hash function to hash the key to an int value
 * 3) Retrieve the value stored at the hashed key value
 *
 */
public class Main {

	public static void main(String[] args) {



	}
}
