# Cryptography
Either encrypts or decrypts text using the Ceasar and Scytale ciphers, with a key of the user's choice. 
This was an individual project I completed for my Software Design & Development class in order to
demonstrate the Strategy Design pattern.

The three strategies applied here are:
- Copy, which I created just to test the structure of the code,
	and which only copies the text input;
- Caesar, which replaces all ASCII characters with the ones corresponding
	to a shift in the ASCII table - the value of this shift being the key
	input by the user.
	For example, the character A (with an ASCII value of 65) is encrypted
	with a key of 3 to the character D (value of 68). Decryption reverses this
	process, subtracting/shifting characters to the left instead of the right.
- Scytale, which transposes characters onto a table with <key> number of columns
	(the number of rows changes depending on text length). The encrypted text
	is obtained by reading this table column by column, instead of row by row.
	Decryption then transposes encrypted text onto a table with <key> number of rows,
	reading it row by row!

