using MusicStore.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MusicStore.Controllers
{
    public class StoreController : Controller
    {

        MusicStoreEntities storeDb = new MusicStoreEntities();

        //
        // GET: /Store/

        public ActionResult Index()
        {
            return View(storeDb.Genres.ToList());
        }

        // 
        // GET: /Store/Browse

        public ActionResult Browse(string genre)
        {
            var genreModel = storeDb.Genres.Include("Albums").Single(g => g.Name == genre);
            return View(genreModel);
        }

        //
        // GET: /Store/Details

        public ActionResult Details(int id)
        {
            var album = storeDb.Albums.Find(id);
            return View(album);
        }
    }
}
