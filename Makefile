presentation.pdf: presentation.tex
	pdflatex $<

distclean:
	rm -f *~ *.synctex.gz *.aux *.log *.out *.backup *.toc *.temp *.nav *.snm

clean: distclean
	rm -f *.pdf
