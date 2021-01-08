import './styles.css';
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as LinkedinIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';
function Footer () {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://youtube.com/devsuperior" target="-new"> 
                <YoutubeIcon />

                </a>
                <a href="https://youtube.com/devsuperior" target="-new">
                    <LinkedinIcon />

                </a>
                <a href="https://youtube.com/devsuperior"  target="-new">
                    <InstagramIcon />

                </a>
            </div>
        </footer>
    )
}

export default Footer;