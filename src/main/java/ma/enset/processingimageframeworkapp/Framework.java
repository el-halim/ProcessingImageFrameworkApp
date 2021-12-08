package ma.enset.processingimageframeworkapp;

import ma.enset.processingimageframeworkapp.compress.Compress;
import ma.enset.processingimageframeworkapp.compress.CompressChild1;
import ma.enset.processingimageframeworkapp.filter.Filter;
import ma.enset.processingimageframeworkapp.filter.FilterDefaultImpl;


public class Framework {

    private Filter filter;
    private Compress compress;
    private static Framework framework;

    private Framework() {
        filter =  new FilterDefaultImpl();
        compress = new CompressChild1();
    }

    public static Framework getInstance()
    {
        if(framework== null)  framework = new Framework();
        return framework;
    }


    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public Compress getCompress() {
        return compress;
    }

    public void setCompress(Compress compress) {
        this.compress = compress;
    }
}
