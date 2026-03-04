@Grab('org.jsoup:jsoup:1.15.3')
import org.jsoup.Jsoup
import java.nio.file.Files
import java.nio.file.Paths

def url = "https://www.thehindu.com/news/national/canada-prime-minister-mike-carney-mumbai-four-day-official-visit-pm-modi-new-delhi/article70683666.ece"

def doc=Jsoup.connect(url).get()
def title = doc.title()
def text = doc.text()

println title