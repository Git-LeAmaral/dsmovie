import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){

    return(
        <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DsMovie</h1>
          <a href="https://github.com/Git-LeAmaral">
            <div className="smovie-contact-container">
              <GithubIcon />
              <p className='dsmovie-contact-link'>/devsuper</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
    );

}

export default Navbar;