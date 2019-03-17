# Intermine Schema Validator

This is a POC for Intermine's [Intermine Schema Validator Project](http://intermine.org/gsoc/project-ideas/2019/#intermine-schema-validator).


The idea is to develop a `jar file` for parsing a biological file which checks whether the given biological data file is correct or not.
In this project the biological files which are to be validated are [GFF](https://www.ensembl.org/info/website/upload/gff.html),[FASTA](https://en.wikipedia.org/wiki/FASTA_format) and CSV or TAB file.

## My Thinking

There are two ways in which file can be parsed:-

1. **Validating the syntax of the file (excluding checking all the lines)** :- This will give the type of the file and the sequence in which the data is stored in it which will help me the next step i.e, checking the content of the file.

2. **Checking every line of the file** :- In this step the file should be verified throughly i.e, checking the every line of the file to check whether the stored data is correct or not.


I have implemented the code to check the extension of the file.

Next, I am planning check the syntax of `.gff3` at both levels i.e, premissive and strict. Then the `.fasata` and then `csv or tab`.
