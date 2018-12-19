presentation.pdf: presentation.tex
	pdflatex $<
	pdflatex $<

clean:
	rm -f *.pdf
