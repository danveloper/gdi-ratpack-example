import com.danveloper.gdi.examples.ratpack.application.ServiceContainer

// Initialize the Service Container
def sc = new ServiceContainer()

get('/') {
   render('index.html')
}

get('/api/status') {
    sc.apiService.version
}